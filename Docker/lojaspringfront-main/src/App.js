import { useEffect, useState } from "react";
import Cabecalho from './componentes/Cabecalho';
import Rodape from './componentes/Rodape';
import Promocoes from './componentes/Promocoes';
import Produtos from './componentes/Produtos';

function App() {
  return (
    <div className="aplicacao">
      <Cabecalho/>
      <Promocoes/>
      <hr/>
      <Produtos/>
      <Rodape/>
    </div>
  );
}

export default App;
