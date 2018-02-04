package com.letgo.quasar.example.modules.product.domain

import java.util.UUID

case class ProductId(id: UUID) {
  override def toString: String = id.toString
}
