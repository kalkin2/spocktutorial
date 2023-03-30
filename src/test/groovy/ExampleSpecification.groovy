import org.example.Polygon
import org.example.Renderer
import org.example.TooFewSidesException
import spock.lang.Specification
import spock.lang.Subject


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

    def "Exception test"() {
        when:
        new Polygon(0)

        then:
        def exception = thrown(TooFewSidesException)
        exception.numberOfSides == 0
    }

    //중간에 하나가 실패해도 모든 테스트의 실행 결과를 볼 수 있다.
    def "Exception test multiple parameter with datatable"() {
        when:
        new Polygon(sides)

        then:
        def exception = thrown(TooFewSidesException)
        exception.numberOfSides == sides

        where:
        sides << [-1, 0,  1, 2]
    }

    def "Exception test multiple parameter2 with datatable"() {
        expect:
        new Polygon(sides).numberOfSides == sides

        where:
        sides << [3,4,5,7,9,100]
    }

    def "should use data tables for calculating max"(){
        expect:
        Math.max(a ,b) == max

        where:
        a  | b  || max
        1  | 10 || 10
        7  | 4  || 7
        20 | 0  || 20
    }

    def "should be a able to mock a concrete class"(){
        given:
        Renderer renderer = Mock()
        @Subject
        Polygon polygon = new Polygon(4,renderer)

        when:
        polygon.draw()

        then:
        4 * renderer.drawLine()


    }
}
