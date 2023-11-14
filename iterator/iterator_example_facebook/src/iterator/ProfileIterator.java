package iterator;

import profile.Profile;

/**
 * Interface padrão para todos os iteradores.
 * @author alexs
 *
 */
public interface ProfileIterator {
    boolean hasNext();
    Profile getNext();
    void reset();
}
