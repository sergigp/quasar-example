package com.letgo.quasar.example.modules.product.application.add

import com.letgo.quasar.example.modules.shared.domain.ExampleDomainError

object ProductAddError {
  sealed abstract class ProductAddError extends ExampleDomainError

  case class ProductAlreadyExistsError(id: String) extends ProductAddError
}
