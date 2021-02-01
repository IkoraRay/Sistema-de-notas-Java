import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
@SuppressWarnings("unused")
public class Root {

	@SuppressWarnings({ "unlikely-arg-type", "static-access" })
	public static void main(String[] args) {
		
		// Indices e auxiliares
		int escolha = 0, confere = 0, indexp = 0, indexd = 0, indexa = 0, indexc = 0, i ;
		
		// Listas de Objetos
		List<Aluno> alunos = new ArrayList<Aluno>();
		List<Professor> professores = new ArrayList<Professor>();
		List<Disciplina> disciplinas = new ArrayList<Disciplina>();
		List<Curso> cursos = new ArrayList<Curso>();
		Menu sysmenu = new Menu();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		//Objetos Auxiliares para busca
		
		Professor presult = new Professor();
		Aluno aresult = new Aluno();
		Curso cresult = new Curso();
		Disciplina dresult = new Disciplina();
		
		
		
		
		// Inicio da execução do menu principal
		while(escolha != 9) {
		sysmenu.menuPrincipal();
		escolha = sc.nextInt();
		
		if (escolha == 1) {		// Escolha para as opções do professor
			
			sysmenu.menuProfessor1();
			escolha = sc.nextInt();
				if (escolha == 1) { 	//Cadastro do professor
					escolha = 0;
					System.out.println("Nome: ");
					presult.nome = sc.nextLine();
					System.out.println("Registro de Professor: ");
					presult.RP = sc.nextInt();
					System.out.println("Senha: ");
					presult.senha = sc.nextLine();
					
					confere = professores.indexOf(Professor.RP == presult.RP);	//Verificação de código
					if (confere == -1) {
						professores.add(new Professor(presult.nome, presult.RP, presult.senha));
						System.out.println("Professor Cadastrado.");
					}
					else {
						System.out.println("Código já cadastrado, operação encerrada.");
					}
					
					
				}
				if (escolha == 2) {		//Listagem de matérias especificas do professor
					escolha = 0;
					System.out.println("Registro de Professor: ");
					presult.RP = sc.nextInt();
					
					confere = professores.indexOf(Professor.RP == presult.RP);
					
					while(confere == -1) {
						System.out.println("Professor não encontrado, digite novamente: ");
						System.out.println("Registro de Professor: ");
						presult.RP = sc.nextInt();
						
						confere = professores.indexOf(Professor.RP == presult.RP);
					}
					indexp = professores.indexOf(Professor.RP == presult.RP);
					presult = professores.get(indexp);
					System.out.printf("Nome: %s", presult.getNome());
					System.out.println("Matérias ministradas:");
					
					presult.listarMinistradas();
					
					sc.nextByte();
					
				}
				if (escolha == 3) {		//Remoção de professor
					escolha = 0;
					System.out.println("Registro de Professor: ");
					presult.RP = sc.nextInt();
					
						confere = professores.indexOf(Professor.RP == presult.RP);
					
					while(confere == -1) {
						System.out.println("Professor não encontrado, digite novamente: ");
						System.out.println("Registro de Professor: ");
						presult.RP = sc.nextInt();
						
						confere = professores.indexOf(Professor.RP == presult.RP);
					}
					
					indexp = professores.indexOf(Professor.RP == presult.RP);
					professores.remove(indexp);
					System.out.println("Professor Removido");
					
				}
				if (escolha == 4) {		//Alteração nos atributos do professor
					escolha = 0;
					System.out.println("Registro de Professor: ");
					presult.RP = sc.nextInt();
						confere = professores.indexOf(Professor.RP == presult.RP);
					
					while(confere == -1) {
						System.out.println("Professor não encontrado, digite novamente: ");
						System.out.println("Registro de Professor: ");
						presult.RP = sc.nextInt();
						
						confere = professores.indexOf(Professor.RP == presult.RP);
					}
					
					indexp = professores.indexOf(Professor.RP == presult.RP);
					
					sysmenu.menuProfessor2();
					
					escolha = sc.nextInt();
					
						if(escolha == 1) {
							escolha = 0;
							System.out.println("Digite o nome atualizado:");
							professores.get(indexp).setNome(sc.nextLine());
							
						}
						if(escolha == 2) {
							escolha = 0;
							System.out.println("Digite a nova senha:");
							professores.get(indexp).setSenha(sc.nextLine());
						}
						if (escolha == 3) {
							escolha = 0;
							
							sysmenu.menuProfessor3();
							escolha = sc.nextInt();
							
							if (escolha == 1) {
								escolha = 0;
								System.out.println("Digite o código da Disciplina:");
								dresult.disCode = sc.nextInt();
								indexd = disciplinas.indexOf(Disciplina.disCode == dresult.disCode);
								if(indexd != -1) {
									professores.get(indexp).addDisciplina(disciplinas.get(indexd));
									System.out.println("Disciplina adicionada.");
								}
								else {
									System.out.println("Disciplina não encontrada, operação encerrada.");
								}
								
								
							}
							if (escolha == 2) {
								escolha = 0;
								System.out.println("Digite o código da Disciplina:");
								dresult.disCode = sc.nextInt();
								indexd = professores.get(indexp).ministradas.indexOf(Disciplina.disCode == dresult.disCode);
								if (indexd != -1) {
									professores.get(indexp).remDisciplina(indexd);
									System.out.println("Disciplina adicionada.");
								}
								else {
									System.out.println("Disciplina não encontrada, operação encerrada.");
								}}}}} //Fim das operações para professor
				
			if(escolha == 2) {
				sysmenu.menuAluno1();
				escolha = sc.nextInt();
				
				if (escolha == 1) { //Registro de Aluno
					escolha = 0;
					System.out.println("Nome: ");
					aresult.nome = sc.nextLine();
					System.out.println("Registro de Aluno: ");
					aresult.RA = sc.nextInt();
					System.out.println("Curso:");
					aresult.curso.nome = sc.nextLine();
					
					confere = cursos.indexOf(Curso.nome == aresult.curso.nome);
					
					while(confere == -1) {
						System.out.println("Curso inválido, digite novamente:");
						aresult.curso.nome = sc.nextLine();
						confere = cursos.indexOf(Curso.nome == aresult.curso.nome);
					}
					
					
					System.out.println("Senha: ");
					aresult.senha = sc.nextLine();
					
					confere = alunos.indexOf(Aluno.RA == aresult.RA);
					if (confere == -1) {
						alunos.add(new Aluno(aresult.nome, aresult.RA, aresult.senha, aresult.curso));
						System.out.println("Aluno Cadastrado.");
					}
					else {
						System.out.println("Registro já cadastrado, operação encerrada.");
					}
					
					
				}
				if (escolha == 2) {	//Listar Disciplinas matriculada
					escolha = 0;
					System.out.println("RA do aluno: ");
					aresult.RA = sc.nextInt();
					confere =  alunos.indexOf(Aluno.RA == aresult.RA);
					
					while (confere == -1) {
						System.out.println("Aluno não encontrado, digite novamente:");
						System.out.println("RA do aluno: ");
						aresult.RA = sc.nextInt();
						confere =  alunos.indexOf(Aluno.RA == aresult.RA);
					}
					
					indexa = alunos.indexOf(Aluno.RA == aresult.RA);
					aresult = alunos.get(indexa);
					
					System.out.println("Nome: "+ aresult.getNome());
					System.out.println("Curso: "+ aresult.getCurso().nome);
					System.out.println("Disciplinas matriculadas: ");
					aresult.listarMatriculadas();
				}
				if (escolha == 3) {		// Remover aluno
					escolha = 0;
					System.out.println("RA do aluno");
					aresult.RA = sc.nextInt();
					
						confere =  alunos.indexOf(Aluno.RA == aresult.RA);
					
					while (confere == -1) {
						System.out.println("Aluno não encontrado, digite novamente:");
						System.out.println("RA do aluno: ");
						aresult.RA = sc.nextInt();
						confere =  alunos.indexOf(Aluno.RA == aresult.RA);
					}
					
					indexa = alunos.indexOf(Aluno.RA == aresult.RA);
					alunos.remove(indexa);
					System.out.println("Aluno Removido");
					
				}
				if (escolha == 4) {		// Alterar aluno
					escolha = 0;
					System.out.println("RA do aluno: ");
					aresult.RA = sc.nextInt();
					
					confere =  alunos.indexOf(Aluno.RA == aresult.RA);
					
					while (confere == -1) {
						System.out.println("Aluno não encontrado, digite novamente:");
						System.out.println("RA do aluno: ");
						aresult.RA = sc.nextInt();
						confere =  alunos.indexOf(Aluno.RA == aresult.RA);
					}
					indexa = alunos.indexOf(Aluno.RA == aresult.RA);
					
					sysmenu.menuAluno2();
						if(escolha == 1) {
							escolha = 0;
							System.out.println("Digite o nome atualizado:");
							alunos.get(indexa).setNome(sc.nextLine());
							
						}
						if (escolha == 2) {
							escolha = 0;
							System.out.println("Digite a nova senha: ");
							alunos.get(indexa).setSenha(sc.nextLine());
						}
						if (escolha == 3) {
							escolha = 0;
							sysmenu.menuProfessor3();
								if(escolha == 1) {
									System.out.println("Digite o código da Disciplina:");
									dresult.disCode = sc.nextInt();
									indexd = disciplinas.indexOf(Disciplina.disCode == dresult.disCode);
									if(indexd != -1) {
										alunos.get(indexa).addDisc(disciplinas.get(indexd));
										System.out.println("Disciplina adicionada.");
									}
									else {
										System.out.println("Disciplina não encontrada, operação encerrada.");
									}
								
							}
								if (escolha == 2) {
									escolha = 0;
									System.out.println("Digite o código da Disciplina:");
									dresult.disCode = sc.nextInt();
									indexd = alunos.get(indexa).atuais.indexOf(Disciplina.disCode == dresult.disCode);
									if (indexd != -1) {
										alunos.get(indexa).remDisc(indexd);
										System.out.println("Disciplina adicionada.");
									}
									else {
										System.out.println("Disciplina não encontrada, operação encerrada.");
									}}
						
						}
						if(escolha == 4) {
							escolha = 0;
							System.out.println("Digite o nome do novo curso: ");
							aresult.curso.nome = sc.nextLine();
							
							confere = cursos.indexOf(Curso.nome == aresult.curso.nome);
							
							while(confere == -1) {
								System.out.println("Curso não encontrado, digite novamente.");
								System.out.println("Digite o nome do curso: ");
								aresult.curso.nome = sc.nextLine();
								
								confere = cursos.indexOf(Curso.nome == aresult.curso.nome);
							}
							
							indexc = cursos.indexOf(Curso.nome == aresult.curso.nome);
							
							alunos.get(indexa).setCurso(cursos.get(indexc));
							
							System.out.println("Curso Alterado.");
						}}} //Fim das operações de Aluno
				if(escolha == 3) {
					escolha = 0;
					sysmenu.menuCurso1();
					escolha = sc.nextInt();
					if(escolha == 1) {		//Adicionar curso
						escolha = 0;
						System.out.println("Nome: ");
						cresult.nome = sc.nextLine();
						System.out.println("Código: ");
						cresult.codCurso = sc.nextInt();
						
						confere = cursos.indexOf(Curso.codCurso == aresult.curso.codCurso);
						
						while(confere != -1) {
							System.out.println("Curso já cadastrado.");
							System.out.println("Nome: ");
							cresult.nome = sc.nextLine();
							System.out.println("Código: ");
							cresult.codCurso = sc.nextInt();
							
							confere = cursos.indexOf(Curso.nome == aresult.curso.nome);
						}
						System.out.println("Adicione uma disciplina.");
						System.out.println("Digite o código da Disciplina:");
						dresult.disCode = sc.nextInt();
						indexd = disciplinas.indexOf(Disciplina.disCode == dresult.disCode);
						
						while(indexd == -1) {
							System.out.println("Disciplina não encontrada, digite novamente.");
							System.out.println("Digite o código da Disciplina:");
							dresult.disCode = sc.nextInt();
							indexd = disciplinas.indexOf(Disciplina.disCode == dresult.disCode);
						}
						
						cursos.add(new Curso(cresult.nome, cresult.codCurso));
						indexc = cursos.indexOf(Curso.nome == aresult.curso.nome);
						cursos.get(indexc).addDisc(disciplinas.get(indexd));
						
					}
					if(escolha == 2) {		//Listar cursos
						escolha = 0;
						System.out.println("Cursos: ");
						for(i = 0; i< cursos.size(); i++) {
							System.out.println(cursos.get(i).nome);
						}
						
					}
					if(escolha == 3) {	//Remover Curso
						escolha = 0;
						
						System.out.println("Digite o nome do curso: ");
						cresult.nome = sc.nextLine();
						
						confere = cursos.indexOf(Curso.nome == cresult.nome);
						
						while(confere == -1) {
							System.out.println("Curso não encontrado, digite novamente.");
							System.out.println("Digite o nome do curso: ");
							cresult.nome = sc.nextLine();
							
							confere = cursos.indexOf(Curso.nome == cresult.nome);
						}
						
						indexc = cursos.indexOf(Curso.nome == aresult.curso.nome);
						cursos.remove(indexc);
						System.out.println("Curso Removido.");
						
					}
					if(escolha == 4) {	//Alterar atributos do curso
						escolha = 0;
						System.out.println("Digite o código do curso: ");
						cresult.codCurso = sc.nextInt();
						
						confere = cursos.indexOf(Curso.codCurso == cresult.codCurso);
						
						while(confere == -1) {
							System.out.println("Curso não encontrado.Digite novamente");
							System.out.println("Digite o código do curso: ");
							cresult.codCurso = sc.nextInt();
							
							confere = cursos.indexOf(Curso.codCurso == cresult.codCurso);
						}
						indexc = cursos.indexOf(Curso.codCurso == cresult.codCurso);
						
						sysmenu.menuCurso2();
							if(escolha == 1) {
								escolha = 0;
								
								System.out.println("Digite o novo nome do curso: ");
								cursos.get(indexc).setNome(sc.nextLine());
								System.out.println("Nome atualizado.");
								
							}
							if(escolha == 2) {
								escolha = 0;
								
								System.out.println("Digite o novo código do curso: ");
								cursos.get(indexc).setCodCurso(sc.nextInt());
								System.out.println("Código atualizado.");
							}
							if(escolha == 3) {
								escolha = 0;
								
								sysmenu.menuProfessor3();
									if(escolha == 1) {
										System.out.println("Digite o código da Disciplina:");
										dresult.disCode = sc.nextInt();
										indexd = disciplinas.indexOf(Disciplina.disCode == dresult.disCode);
										if(indexd != -1) {
											cursos.get(indexc).addDisc(disciplinas.get(indexd));
											System.out.println("Disciplina adicionada.");
										}
										else {
											System.out.println("Disciplina não encontrada, operação encerrada.");
										}
									
								}
									if (escolha == 2) {
										escolha = 0;
										System.out.println("Digite o código da Disciplina:");
										dresult.disCode = sc.nextInt();
										indexd = cursos.get(indexc).ementa.indexOf(Disciplina.disCode == dresult.disCode);
										if (indexd != -1) {
											cursos.get(indexc).remDisc(indexd);
											System.out.println("Disciplina adicionada.");
										}
										else {
											System.out.println("Disciplina não encontrada, operação encerrada.");
										}}}}} //Fim operações de Curso
				if(escolha == 4) {
					sysmenu.menuDisc1();
					escolha = sc.nextInt();
						if(escolha == 1) {		// Registrar disciplina
							escolha = 0;
							System.out.println("Digite o nome da Disciplina: ");
							dresult.nome = sc.nextLine();
							System.out.println("Digite o código da Disciplina:");
							dresult.disCode = sc.nextInt();
							
							confere = disciplinas.indexOf(Disciplina.disCode == dresult.disCode);
							
							while (confere != -1) {
								System.out.println("Disciplina já cadastrada, digite novamente");
								System.out.println("Digite o nome da Disciplina: ");
								dresult.nome = sc.nextLine();
								System.out.println("Digite o código da Disciplina:");
								dresult.disCode = sc.nextInt();
								
								confere = disciplinas.indexOf(Disciplina.disCode == dresult.disCode);
							}
							
							System.out.println("Digite a carga horária: ");
							dresult.cargaHoraria = sc.nextInt();
							disciplinas.add(new Disciplina(dresult.nome,dresult.disCode,dresult.cargaHoraria));
						
						}
						if(escolha == 2) {		// Mostrar informações da Disciplina
							escolha = 0;
							System.out.println("Digite o código da Disciplina:");
							dresult.disCode = sc.nextInt();
							
							confere = disciplinas.indexOf(Disciplina.disCode == dresult.disCode);
							
							while(confere == -1) {
								System.out.println("Disciplina não encontrada, digite novamente.");
								System.out.println("Digite o código da Disciplina:");
								dresult.disCode = sc.nextInt();
								confere = disciplinas.indexOf(Disciplina.disCode == dresult.disCode);
							}
							indexd = disciplinas.indexOf(Disciplina.disCode == dresult.disCode);
							
							System.out.println("Informações da disciplina.");
							System.out.println("Nome: "+ disciplinas.get(indexd).getNome());
							System.out.println("Código: "+ disciplinas.get(indexd).getDisCode());
							System.out.println("Carga Horária: "+ disciplinas.get(indexd).getCargaHoraria());
							
							
						
						}
						if(escolha == 3) {		// Remover disciplina
							escolha = 0;
							System.out.println("Digite o código da Disciplina:");
							dresult.disCode = sc.nextInt();
							
							confere = disciplinas.indexOf(Disciplina.disCode == dresult.disCode);
							
							while(confere == -1) {
								System.out.println("Disciplina não encontrada, digite novamente.");
								System.out.println("Digite o código da Disciplina:");
								dresult.disCode = sc.nextInt();
								confere = disciplinas.indexOf(Disciplina.disCode == dresult.disCode);
							}
							indexd = disciplinas.indexOf(Disciplina.disCode == dresult.disCode);
							disciplinas.remove(indexd);
							System.out.println("Disciplina Removida");
						}
						if(escolha == 4) {		//Alterar disciplina
							escolha = 0;
							System.out.println("Digite o código da Disciplina:");
							dresult.disCode = sc.nextInt();
							
							confere = disciplinas.indexOf(Disciplina.disCode == dresult.disCode);
							
							while(confere == -1) {
								System.out.println("Disciplina não encontrada, digite novamente.");
								System.out.println("Digite o código da Disciplina:");
								dresult.disCode = sc.nextInt();
								confere = disciplinas.indexOf(Disciplina.disCode == dresult.disCode);
							}
							indexd = disciplinas.indexOf(Disciplina.disCode == dresult.disCode);
							
							sysmenu.menuDisc2();
							if(escolha == 1) {
								escolha = 0;
								System.out.println("Digite o novo nome da Disciplina: ");
								disciplinas.get(indexd).setNome(sc.nextLine());
								System.out.println("Nome Atualizado.");
							}
							if(escolha == 2) {
								escolha = 0;
								System.out.println("Digite o novo código da Disciplina:");
								disciplinas.get(indexd).setDisCode(sc.nextInt());
								System.out.println("Código Atualizado.");
							}
							if(escolha == 3) {
								escolha = 0;
								System.out.println("Digite a nova carga horária: ");
								disciplinas.get(indexd).setCargaHoraria(sc.nextInt());
								System.out.println("Carga Horária Atualizada.");
							}
							
						}
				}
				
				}
		
		

	}
	}


