package io.wrtn.project.web.config

import io.wrtn.kommons.logging.KLogging
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan(basePackages = ["io.wrtn.project"])
class ProjectConfig {

    companion object: KLogging()


}
