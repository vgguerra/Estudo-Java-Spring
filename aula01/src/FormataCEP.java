package src;

public class FormataCEP {

    public static void main(String[] args) {
        try {
            String cepFormatado = formataCEP("21344134");
            System.out.println("CEP formatado: " + cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String formataCEP(String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException("Digite um CEP válido com 8 dígitos.");
        }

        // Formata o CEP no formato XXXXX-XXX
        return cep.substring(0, 5) + "-" + cep.substring(5, 8);
    }
}
