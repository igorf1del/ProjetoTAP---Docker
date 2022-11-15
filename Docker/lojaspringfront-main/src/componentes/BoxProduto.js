import React from 'react';
import { formatarMoeda } from '../servicos/FormatadorService';

export default function BoxProduto({produto}) {

  return (
    <div className='box-produto'>
      <img src={produto.foto}/>
      <small>{produto.nome}</small>
      <h3>{formatarMoeda(produto.valor)}</h3>
    </div>
  )
}
