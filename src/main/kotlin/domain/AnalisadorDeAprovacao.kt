package domain

class AnalisadorDeAprovacao {

    // ---------------------------------
    //
    //      Seu código deve vir aqui
    //
    //      Defina atributos e métodos conforme especificado
    //      no arquivo de teste encontrado em
    //      'src/test/kotlin/domain/AnalisadorDeAprovacaoTest'
    //
    // ---------------------------------

    private CriterioDeAprovacao criterio;

    fun defineCriterio(criterioDeAprovacao: CriterioDeAprovacao)
    {
        criterio = criterioDeAprovacao;
    }

    fun fechaBoletim(boletim: Boletim) : BoletimFechado
    {
        boletimFechado: BoletimFechado = BoletimFechado();

        boletimFechado.mediaEPs = boletim.mediaEPs;
        boletimFechado.mediaMiniEPs = boletim.mediaMiniEPs;
        boletimFechado.mediaFinal = criterio.mediaFinal(boletim);
        boletimFechado.foiAprovado = criterio.estaAprovado(boletim);

        return boletimFechado;
    }
}