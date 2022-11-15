import React, { useEffect, useState } from 'react'
import Aguarde from './Aguarde';
import BoxProduto from './BoxProduto';
import axios from 'axios';

const BACKEND_URL = process.env.REACT_APP_BACKEND_URL;

export default function Produtos() {
  const [produtos, setProdutos] = useState([]);

  useEffect(() => {
    axios.get(`${BACKEND_URL}/produtos/`).then((response) => {
      setProdutos(response.data);
    });
  }, []);

  const renderProduto = (p) => <BoxProduto key={p.id} produto={p}/>

  return (
    <div className="produtos">
      { produtos.length === 0 && <Aguarde/> || produtos.map(renderProduto) }
    </div>
  )
}
