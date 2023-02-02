package parte1;

public class GestioneDipendenti {

	public static void main(String[] args) {
		Dipendente op1 = new Dipendente("mat:666", Dipartimento.PRODUZIONE);
		Dipendente op2 = new Dipendente("mat:777", Dipartimento.PRODUZIONE);
		Dipendente imp = new Dipendente("mat:765", 8000, 40, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);
		Dipendente dir = new Dipendente("mat:009", 100, 50, Livello.DIRIGENTE, Dipartimento.VENDITE);

		System.out.println(" ");
		op1.promuovi();
		imp.promuovi();
		System.out.println(" ");
		op1.stampaDatiDipendente();
		op2.stampaDatiDipendente();
		imp.stampaDatiDipendente();
		dir.stampaDatiDipendente();
		System.out.println(" ");
		Dipendente.calcolaPagaPlus(op1, 5);
		Dipendente.calcolaPagaPlus(op2, 5);
		Dipendente.calcolaPagaPlus(imp, 5);
		Dipendente.calcolaPagaPlus(dir, 5);
		System.out.println(" ");
		System.out.println(" PROVE CONTROLLI STIPENDIO ");
		Dipendente d1 = new Dipendente("mat:0091", 1900, 50, Livello.OPERAIO, Dipartimento.VENDITE);
		Dipendente d2 = new Dipendente("mat:0092", 900, 50, Livello.OPERAIO, Dipartimento.VENDITE);
		Dipendente d3 = new Dipendente("mat:0093", 2000, 50, Livello.IMPIEGATO, Dipartimento.VENDITE);
		Dipendente d4 = new Dipendente("mat:0094", 1100, 50, Livello.IMPIEGATO, Dipartimento.VENDITE);
		Dipendente d5 = new Dipendente("mat:0095", 10000, 50, Livello.QUADRO, Dipartimento.VENDITE);
		Dipendente d6 = new Dipendente("mat:0096", 100, 50, Livello.QUADRO, Dipartimento.VENDITE);
		Dipendente d7 = new Dipendente("mat:009", 100, 50, Livello.DIRIGENTE, Dipartimento.VENDITE);
		d1.stampaDatiDipendente();
		d2.stampaDatiDipendente();
		d3.stampaDatiDipendente();
		d4.stampaDatiDipendente();
		d5.stampaDatiDipendente();
		d6.stampaDatiDipendente();
		d7.stampaDatiDipendente();
	}

}
