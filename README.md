Resumo
A classe Atendimento é responsável por manter os dados dos atendimentos
realizados, ela possui quatro relacionamentos com a classe Usuario.
O relacionamento identificado como “usuAbertura” identifica o usuário
responsável pela abertura do atendimento, um atendimento deve ter um usuário e
um usuário pode ter nenhum ou muitos atendimentos.
Já o relacionamento identificado como “usuEncerra” identifica o usuário
responsável pelo encerramento do atendimento, um atendimento poderá ter nenhum
ou no máximo um usuário.
O terceiro relacionamento identificado como “vendedor” identifica o vendedor
responsável pelo atendimento, um atendimento deve ter um vendedor e um
vendedor poderá ter nenhum ou muitos atendimentos.48
Por fim o relacionamento identificado como “vendAnterior” identifica o
vendedor responsável por atendimentos anteriores a este cliente, se for o caso. Um
atendimento pode possuir nenhum ou no máximo um vendedor, e um vendedor
poderá ter nenhum ou muitos atendimentos.
A classe Orcamento é responsável por manter os dados dos orçamentos
emitidos, ela possui relacionamentos com as classes Atendimento e Usuário, onde
um orçamento deverá referenciar um Atendimento, e um atendimento poderá ter
nenhum ou muitos orçamentos. Um orçamento deverá referenciar um usuário, e um
usuário poderá ter nenhum ou muitos orçamentos.
Os contatos realizados com o cliente durante um atendimentos são mantidos
na classe Contato, ela possui relacionamento com as classes Usuario, Atendimento
e LocalContato, onde: Um contato deverá ter um usuário, e um usuário poderá ter
nenhum ou muitos contatos; Um contato deverá ter um atendimento, e um
atendimento poderá ter nenhum ou muitos contatos; Um contato deverá ter um local
de contato, e um local de contato poderá ter nenhum ou muitos contatos.
A classe VendaPerdida é responsável por manter as verbalizações dos
clientes para os atendimentos encerrados com o status “P” (venda perdida). Possui
relacionamento com a classe Atendimento, onde uma venda perdida deverá
referenciar um atendimento, e um atendimento poderá ter nenhuma ou muitas
vendas perdidas.
Todo atendimento deve pertencer a uma revenda, por isso a classe Revenda
possui um relacionamento com a classe Atendimento, onde um atendimento deve
referenciar uma revenda, e uma revenda pode ter nenhum ou muitos atendimentos.
Por fim a classe Pessoa possui um relacionamento com a classe
Atendimento, a fim de identificar o cliente deste atendimento, onde um atendimento
pode ter nenhum ou no máximo um ciente, e um cliente pode ter nenhum ou muitos
atendimentos.
A classe Veiculo é responsável por armazenas os dados dos veículos em
estoque, ela possui um relacionamento com a classe Modelo, onde um veículo
deverá referenciar um modelo, e um modelo poderá ter nenhum ou muitos veículos.
Cada veículo poderá ter uma lista de acessórios disponíveis, conforme o seu
modelo, com isso a classe Acessorio possui um relacionamento com a classe
Modelo, onde um acessório poderá ter nenhum ou muitos modelos, e um modelo
poderá ter nenhum ou muitos acessórios.
Já a classe Orcamento é responsável por manter os dados dos orçamentos
emitidos, ela possui uma lista da classe Acessorio, onde um orçamento pode ter
nenhum ou muitos acessórios, e um acessório pode ter nenhum ou muitos
orçamentos. Ela também possui um relacionamento com a classe Atendimento,
onde um orçamento deve ter um atendimento, e um atendimento pode ter nenhum
ou muitos orçamentos.