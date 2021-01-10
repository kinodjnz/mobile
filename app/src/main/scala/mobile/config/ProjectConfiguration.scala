package mobile.config

import mobile.controller.ControllerComponentScan
import org.springframework.context.annotation.{Configuration, Import}

@Configuration
@Import(Array(classOf[ControllerComponentScan]))
class ProjectConfiguration {
}
