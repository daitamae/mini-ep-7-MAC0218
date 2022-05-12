package domain
import domain.criterios.CriterioDeAprovacao
import domain.criterios.Basico

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

    private var criterio: CriterioDeAprovacao = Basico()

    fun defineCriterio(criterioDeAprovacao: CriterioDeAprovacao)
    {
        criterio = criterioDeAprovacao
    }

    fun fechaBoletim(boletim: Boletim) : BoletimFechado
    {
        return BoletimFechado(
            boletim.mediaEPs,
            boletim.mediaMiniEPs,
            criterio.mediaFinal(boletim),
            criterio.estaAprovado(boletim)
        )
    }
}