public class ServiceStation {
    public void check(Vehicle vehicle) {
            System.out.println("Обслуживаем " + vehicle.getModelName());
            for (int i = 0; i < vehicle.getWheelsCount(); i++) {
                vehicle.beServed();
            }
        }
    }