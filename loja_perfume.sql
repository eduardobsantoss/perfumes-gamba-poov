CREATE DATABASE loja_perfume;
CREATE TABLE perfume ( 
    id_perfume INT NOT NULL,
    volume FLOAT,
    lote DECIMAL,
    tipoDoPerfume INT NOT NULL,
    valorVenda DECIMAL,
    corDoLiquido INT NOT NULL,
    
    PRIMARY KEY(id_perfume)
);

CREATE TABLE cliente (
    cpf VARCHAR (11),
    nome VARCHAR(60),
    telefone VARCHAR(60),
    endereco VARCHAR(60),
    end_insta VARCHAR(60),
    end_face VARCHAR(60),
    cartaoDeCredito VARCHAR(16),
    pix VARCHAR(32),
    
    PRIMARY KEY (cpf)
);

CREATE TABLE pedido (
	id_pedido INT NOT NULL,
    fk_cpf VARCHAR (11),
    dataPedido DATE,
    prazoEntrega INT NOT NULL,
    
    PRIMARY KEY (id_pedido),
    
    FOREIGN KEY (fk_cpf)
	REFERENCES cliente(cpf)
);

CREATE TABLE pedido_perfume (
	id_pedido_perfume INT NOT NULL,
    fk_id_pedido INT NOT NULL,
    fk_id_perfume INT NOT NULL,
    quantidade INT NOT NULL,
    
    PRIMARY KEY (id_pedido_perfume),
    
    FOREIGN KEY (fk_id_pedido)
	REFERENCES pedido(id_pedido),
    
    FOREIGN KEY (fk_id_perfume)
	REFERENCES chocolate(id_perfume)
);
commit;