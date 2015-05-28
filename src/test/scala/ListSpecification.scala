import org.scalacheck._
import com.example.Functions._

object ListSpecification extends Properties("List") {

  import Prop.{forAll,BooleanOperators}

 // property("fill") = forAll {(n: Int) => (n>=0 && n < 100000000) ==> (fill("",n).length == n) }
 // property("concat") = forAll {(l1: List[String],l2: List[String]) => concat(l1,l2).length == l1.length+l2.length}

}
