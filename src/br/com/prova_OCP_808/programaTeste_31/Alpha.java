package br.com.prova_OCP_808.programaTeste_31;

public class Alpha {

	int ns;
	static int s;
	Alpha(int ns) {
		if (s < ns) {
			s = ns;
			this.ns = ns;
		}
	}
	void doPrint() {
		System.out.println("ns = " + ns + " s = " + s);
	}
}
