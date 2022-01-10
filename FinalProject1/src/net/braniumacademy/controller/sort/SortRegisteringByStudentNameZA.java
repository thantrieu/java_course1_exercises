package net.braniumacademy.controller.sort;

import java.util.Comparator;
import net.braniumacademy.model.Registering;

/**
 *
 * @author braniumacademy <braniumacademy.net>
 */
public class SortRegisteringByStudentNameZA implements Comparator<Registering> {

    @Override
    public int compare(Registering o1, Registering o2) {
        return o2.getStudent().getFirstName()
                .compareTo(o1.getStudent().getFirstName());
    }

}
