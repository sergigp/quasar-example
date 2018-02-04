package com.letgo.quasar.example.modules.shared.domain

object Currency {
  def dollar: Currency = Currency("USD")
}

case class Currency(code: String)
