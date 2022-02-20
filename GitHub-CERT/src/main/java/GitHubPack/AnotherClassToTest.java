package GitHubPack;

public class AnotherClassToTest {
		
		private Double numero;

		public AnotherClassToTest(Double numero) {
			this.numero = numero;
		}

		public Double getNumero() {
			return numero;
		}

		public void setNumero(Double numero) {
			this.numero = numero;
		}
		
		public String valorEmString() {
			
			String valorEmString = String.valueOf(this.numero); 
			return valorEmString;
		}
		
	
}
