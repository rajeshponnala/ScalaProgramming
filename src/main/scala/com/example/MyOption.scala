package com.example

trait MyOption[+A] {

  def map[B] (f: A => B): MyOption[B] = this match {
    case MyNone => MyNone
    case MySome(x) => MySome(f(x))
  }

  def flatMap[B](f: A => MyOption[B]): MyOption[B] = this match {
    case MyNone => MyNone
    case MySome(x) => f(x)
  }

  def getOrElse[B >: A](default: => B) : B = this match {
    case MyNone => default
    case MySome(x) => x
  }

  def filter(f: A => Boolean): MyOption[A] = this match {
    case MySome(x) if(f(x)) => this
    case _ => MyNone
  }

  def orElse[B >: A](ob: => MyOption[B]): MyOption[B] = this match {
    case MyNone => ob
    case _ => this
  }
}
case class MySome[A](get: A) extends MyOption[A]
case object MyNone extends MyOption[Nothing]
