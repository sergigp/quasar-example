package com.letgo.quasar.example.modules.product.infrastructure

import scala.concurrent.Future

import com.letgo.quasar.example.modules.product.domain.Product
import com.letgo.quasar.example.modules.product.domain.{ProductId, ProductRepository}

class ProductRepositorySlick extends ProductRepository[Future] {
  override def search(id: ProductId): Future[Product] = ???

  override def add(product: Product): Future[Unit] = ???
}
