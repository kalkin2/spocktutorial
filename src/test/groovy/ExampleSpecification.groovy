import org.example.Polygon
import spock.lang.Specification


class ExampleSpecification extends Specification{


    def "shoud be s simple assertion"() {
        expect:
        1==1
    }

    def "shoud demonstrate given-when-then"(){
        given:
        def polygon = new Polygon(4);

        when:
        int side1 = polygon.numberOfSides // get 생략 가능

        int side2 = polygon.getNumberOfSides()

        then:
        side1 == 4
        side2 == 4

    }


}
