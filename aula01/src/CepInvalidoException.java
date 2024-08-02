package src;

// Definindo a exceção personalizada CepInvalidoException
class CepInvalidoException extends Exception {
    public CepInvalidoException(String mensagem) {
        super(mensagem);
    }
}