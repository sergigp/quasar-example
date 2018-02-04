package com.letgo.quasar.example.modules.product.domain

trait ProductRepository[P[_]] {
  def search(id: ProductId): P[Product]

  def add(product: Product): P[Unit]
}
