package calculator

import calculator.ir._

package object semantics {
  def eval(expr: Expr): Int = expr match {
    case Num(i) ⇒ i
    case Plus(l, r) ⇒ eval(l) + eval(r)
    case Minus(l, r) => eval(l) - eval(r)
    case Mult(l, r) => eval(l) * eval(r)
    case Div(l, r) => eval(l) / eval(r)
    case Paren(e) => eval(e)
  }
}