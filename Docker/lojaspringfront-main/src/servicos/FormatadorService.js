const moedaFormatter = new Intl.NumberFormat('pt-BR', {
  style: 'currency',
  currency: 'BRL'
});

module.exports = {
  formatarMoeda: (valor) => moedaFormatter.format(valor)
};