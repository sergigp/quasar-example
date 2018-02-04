package com.letgo.quasar.example.modules.product.domain.add

import com.letgo.quasar.example.modules.product.application.add.ProductAddError.ProductAddError
import com.letgo.quasar.example.modules.product.domain.{Price, ProductId, ProductRepository}

class UserAdder[P[_]](productRepository: ProductRepository[P]) {
  def add(id: ProductId, price: Price): P[Either[ProductAddError, Unit]] =
    productRepository.search(id)
    productRepository.add(Price(id, price))
}
