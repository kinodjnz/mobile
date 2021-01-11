package mobile.controller.contract

import mobile.controller.contract.request.ContractApplicationRequest
import org.springframework.web.bind.annotation.{RequestBody, RequestMapping, RequestMethod, RestController}

@RestController
class ContractApi {
  @RequestMapping(method = Array(RequestMethod.POST), value = Array("contract"))
  def contract(@RequestBody application: ContractApplicationRequest): String = application.plan + "\n"
}
