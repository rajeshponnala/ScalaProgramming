package com.example

object MyList
{
  def headOption[A](l: List[A]): MyOption[A] = l match {
    case Nil => MyNone
    case x::_ => MySome(x)
  }
}
