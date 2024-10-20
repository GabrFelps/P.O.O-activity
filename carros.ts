class Carro {
  marca: string;
  cor: string;
  ano: number;

  constructor(marca: string, cor: string, ano: number) {
    this.marca = marca;
    this.cor = cor;
    this.ano = ano;
  }

  acelerar(): void {
    console.log(`${this.marca} está acelerando.`);
  }

  frear(): void {
    console.log(`${this.marca} está freando.`);
  }
}

let fusca: Carro = new Carro('Fusca', 'azul', 1975);
let civic: Carro = new Carro('Civic', 'preto', 2024);

fusca.acelerar();
civic.acelerar();  