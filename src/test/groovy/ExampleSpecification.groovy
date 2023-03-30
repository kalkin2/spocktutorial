import org.example.Polygon
import spock.lang.Specification


class ExampleSpecification extends Specification{


    def "shoud be s simple assertion"() {
        expect:
        1==1
    }

    def "should demonstrate given-when-then"(){

        when:
        int side1 = new Polygon(4).numberOfSides // get 생략 가능

        int side2 = new Polygon(4).getNumberOfSides()

        then:
        side1 == 4
        side2 == 4

    }


}
