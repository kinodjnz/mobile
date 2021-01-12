package mobile.controller.contract

import mobile.controller.contract.request.ContractApplicationRequest
import org.springframework.web.bind.annotation.{RequestBody, RequestMapping, RequestMethod, RestController}

import javax.validation.Valid

@RestController
class ContractApi {
  @RequestMapping(method = Array(RequestMethod.POST), value = Array("contract"))
  def contract(@RequestBody @Valid application: ContractApplicationRequest): String = application.toDomainObject.toString + "\n"
}
