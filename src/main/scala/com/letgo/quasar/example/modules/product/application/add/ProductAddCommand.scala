package com.letgo.quasar.example.modules.product.application.add

import com.letgo.quasar.command.Command
import com.letgo.quasar.example.modules.product.application.add.ProductAddError.ProductAddError

case class ProductAddCommand(id: String, amount: Double, currency: String) extends Command {
  override type CommandError = ProductAddError
}
