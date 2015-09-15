package part11.ex32;//: holding/NonCollectionSequence.java


import part11.ex30.InterfaceVsIterator;
import part11.ex5.pets.Pet;
import part11.ex5.pets.Pets;

import java.util.*;

import static Utils.Print.*;

class PetSequence {
    protected Pet[] pets = Pets.createArray(8);
}

public class NonCollectionSequence extends PetSequence {
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;

            public boolean hasNext() {
                return index < pets.length;
            }

            public Pet next() {
                return pets[index++];
            }

            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }

    public Iterator<Pet> reverse() {
        List<Pet> petList = new ArrayList<>(Arrays.asList(pets));
        Collections.shuffle(petList);
        return petList.iterator();
    }

    public Iterator<Pet> randomized() {
        return new Iterator<Pet>() {

            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Pet next() {
                return null;
            }
        };
    }

    public static void main(String[] args) {
        NonCollectionSequence nc = new NonCollectionSequence();
        print("iterator");
        InterfaceVsIterator.display(nc.iterator());
        print("reverse");
        InterfaceVsIterator.display(nc.reverse());
        print("randomized");
        InterfaceVsIterator.display(nc.randomized());
    }
}
