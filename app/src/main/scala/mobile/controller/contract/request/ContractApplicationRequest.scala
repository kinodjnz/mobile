package mobile.controller.contract.request

import com.fasterxml.jackson.annotation.JsonProperty
import mobile.domain.model.contract.ContractApplication

case class ContractApplicationRequest() {
  @JsonProperty("plan")
  var plan: String = _

  def toDomainObject: ContractApplication = {
    ContractApplication(PlanForApi.of(plan).plan)
  }
}
