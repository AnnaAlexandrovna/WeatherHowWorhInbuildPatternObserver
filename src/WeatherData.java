import java.util.Observable;

public class WeatherData extends Observable {

    private float temperarure;
    private float humidity;
    private float pressure;

    public WeatherData(){}

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements (float temperarure, float humidity, float pressure) {
        this.temperarure = temperarure;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }

    public float getTemperarure(){
        return temperarure;
    }

    public float getHumidity(){
        return humidity;
    }

    public float getPressure(){
        return pressure;
    }
}
