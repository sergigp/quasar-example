package com.letgo.quasar.example.modules.product.application.add

import com.letgo.quasar.command.CommandHandler
import com.letgo.quasar.example.modules.product.domain.add.UserAdder

class ProductAddCommandHandler[P[_]](userAdder: UserAdder) extends CommandHandler[P, ProductAddCommand] {
  override def handle(command: ProductAddCommand) = ???
}
