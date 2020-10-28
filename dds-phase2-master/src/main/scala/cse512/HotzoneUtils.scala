package cse512

object HotzoneUtils {

  def ST_Contains(queryRectangle: String, pointString: String ): Boolean = {
    //fetching datapoints from string representation
    val rectangleArray = queryRectangle.split(",")
    val pointArray = pointString.split(",")

    //fetching values for respective axis
    val xAxisVal = (- pointArray{0}.toDouble + rectangleArray{0}.toDouble ) * (- pointArray{0}.toDouble + rectangleArray{2}.toDouble )

    val yAxisVal = (- pointArray{1}.toDouble + rectangleArray{1}.toDouble ) * (-pointArray{1}.toDouble + rectangleArray{3}.toDouble)

    //checking if point contains inside rectangle or not
    if (xAxisVal <= 0 && yAxisVal <= 0) {

      return true

    }
    else {

      return false

    }
  }
}