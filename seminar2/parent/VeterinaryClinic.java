package seminar2.parent;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    /**
     * ������ �������� - �������� �������.
     */
    private final List<Animal> ANIMALS;
    private final List<Doctor> Doctors;

    public VeterinaryClinic() {
        this.ANIMALS = new ArrayList<>();
        this.Doctors = new ArrayList<>();
    }

    public VeterinaryClinic addAnimal(Animal animal) {
        ANIMALS.add(animal);
        return this;
    }
    public VeterinaryClinic addDoctor(Doctor doctor) {
        Doctors.add(doctor);
        return this;
    }

    public List<Animal> getANIMALS() {
        return ANIMALS;
    }
    public List<Doctor> getDoctors() {
        return Doctors;
    }

    public List<Speakable> getSpeakable() {
        List<Speakable> result = new ArrayList<>();
        for (Animal animal: getANIMALS()) {
            if (animal instanceof Speakable) {
                result.add((Speakable) animal);
            }
        }
        return result;
    }

    public List<Flyable> getFlyable() {
        List<Flyable> result = new ArrayList<>();
        for (Animal animal: getANIMALS()) {
            if (animal instanceof Flyable) {
                result.add((Flyable) animal);
            }
        }
        return result;
    }
    public List<Runnable> getRunnable() {
        List<Runnable> result = new ArrayList<>();
        for (Animal animal: getANIMALS()) {
            if (animal instanceof Runnable) {
                result.add((Runnable) animal);
            }
        }
        return result;
    }

    public List<Swimmable> getSwimmable() {
        List<Swimmable> result = new ArrayList<>();
        for (Animal animal: getANIMALS()) {
            if (animal instanceof Swimmable) {
                result.add((Swimmable) animal);
            }
        }
        return result;
    }

}
