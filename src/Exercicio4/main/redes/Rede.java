package Exercicio4.main.redes;

import Exercicio4.main.componentes.ComponenteRede;

public interface Rede<T extends ComponenteRede> {
    void enviarDados(T componenteRede);
}
