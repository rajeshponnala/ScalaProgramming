import org.scalacheck._
import com.example.Functions._

object MathsSpecifications extends Properties("Maths") {

  import Prop.{forAll,BooleanOperators}

  property("add") = forAll {(x: Int,y: Int) => add(x,y)-y == x}

  property("sub") = forAll {(x: Int,y: Int) => sub(x,y)+y == x}

 // property("power") = forAll {(x:Int,y:Int) => (x>0 && y<10) ==> (power(x,y)/power(x,y-1) == x) }

}
