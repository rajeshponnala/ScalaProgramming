import org.scalacheck._
import com.example.Functions._

object StringSpecification extends Properties("Strings") {

  import Prop.{forAll,BooleanOperators}

  property("isSubtring") = forAll {(x1: String,x2: String) => (isSubString(x1,x2) == (x1.indexOf(x2) >= 0)) }
}
