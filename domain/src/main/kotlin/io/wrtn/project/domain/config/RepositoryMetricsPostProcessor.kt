package io.wrtn.project.domain.config

import io.wrtn.kommons.logging.KLogging
import io.wrtn.kommons.logging.debug
import org.springframework.beans.factory.config.BeanPostProcessor
import org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport
import java.util.concurrent.TimeUnit

class RepositoryMetricsPostProcessor: BeanPostProcessor {

    companion object: KLogging()

    override fun postProcessBeforeInitialization(bean: Any, beanName: String): Any {
        if (bean is RepositoryFactoryBeanSupport<*, *, *>) {
            // RepositoryFactory가 Repository를 생성할 때 작업을 추가할 수 있습니다.
            bean.addRepositoryFactoryCustomizer { factory ->
                /**
                 * [CrudRepository] 실행 정보를 Metrics로 측정할 수 있도록 할 수 있습니다.
                 */
                factory.addInvocationListener { invocation ->
                    log.debug {
                        val method = invocation.repositoryInterface.simpleName + "." + invocation.method.name
                        val elapsed = invocation.getDuration(TimeUnit.MILLISECONDS)
                        val result = invocation.result?.state
                        "method=$method: $elapsed msec - $result"
                    }
                }
            }
        }

        return bean
    }
}
