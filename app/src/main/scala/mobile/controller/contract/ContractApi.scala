package mobile.controller.contract

import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, RequestParam, RestController}

@RestController
class ContractApi {
  @RequestMapping(method = Array(RequestMethod.POST), value = Array("contract"))
  def contract(@RequestParam("message") message: String): String = message + "\n"
}
