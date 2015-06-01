package com.example


object Functions {

  def reverse[T](l: List[T]): List[T] =
  {
     def loop(l1: List[T], acc :List[T]): List[T] =
       if(l1.isEmpty) acc
       else loop(l1.tail, l1.head::acc)
    loop(l, List.empty)
  }

  def headOption[T](l: List[T]): Option[T] =
  {
    l match {
      case Nil => None
      case (x :: _) => Some(x)
    }
  }

  def max2(a: Int,b: Int)= if(a>b) a else b

  def add(x: Int,y: Int) = x + y

  def sub(x: Int,y: Int) = x - y

  def mul(x: Long,y: Long) = x * y

  def power(x: BigInt,y: BigInt): BigInt =
  {
    def loop(counter: BigInt,acc: BigInt): BigInt =
      if(counter == y) acc else loop(counter+1,acc*x)
    loop(1,x)
  }

  def startsWith(s: String,c: Char)= s(0) == c

  def fill[A](e: A,n: Int): List[A] =
  {
    def loop(acc: List[A],count: Int): List[A] =
      if(count==n) acc else loop(e :: acc,count+1)
    loop(List.empty[A],0)
  }

  def concat[A](l1: List[A],l2:List[A]): List[A] =
  {
    var res = l1
    for(x <- l2)
      res = res :+ x
    res
  }


  def getSubString(s: String,cPos: Int,noofelements: Int): String = {

     def loop(cIndex: Int,count: Int,res: String): String =
       if(count >= noofelements) res else loop(cIndex+1,count+1,res+s(cIndex))
     loop(cPos,0,"")
  }



  def isSubString(s: String,ss: String): Boolean =
  {
    var res =false
    var sIndex = 0;
    while(!res && sIndex+ss.length <= s.length)
      {
       res = getSubString(s,sIndex,ss.length) == ss
       sIndex = sIndex+1
      }
    res
  }

  def mean(xs: Seq[Double]): MyOption[Double] = xs match {
    case Nil => MyNone
    case _ => MySome(xs.sum/xs.length)
  }

  def variance(xs: Seq[Double]): MyOption[Double] =
    mean(xs).flatMap { x => mean(xs.map(y=> math.pow(y-x,2)))}
}
