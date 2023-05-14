import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './comp/home/home.component';
import { LoginComponent } from './comp/login/login.component';
import { NewExperienciaComponent } from './comp/experiencia/new-experiencia.component';
import { EditExperienciaComponent } from './comp/experiencia/edit-experiencia.component';
import { EditeducacionComponent } from './comp/educacion/editeducacion.component';
import { NeweducacionComponent } from './comp/educacion/neweducacion.component';
import { EditSkillComponent } from './comp/hardsoft/edit-skill.component';
import { NewSkillComponent } from './comp/hardsoft/new-skill.component';
import { EditAcercaDeComponent } from './comp/acerca-de/edit-acerca-de.component';
import { NewProyectoComponent } from './comp/proyect/new-proyecto.component';
import { EditProyectoComponent } from './comp/proyect/edit-proyecto.component';

const routes: Routes = [{path:'', component: HomeComponent},
{path: 'login', component: LoginComponent},
{path: 'editacercade/:id', component: EditAcercaDeComponent},
{path: 'newskill', component: NewSkillComponent},
{path: 'editskill/:id', component: EditSkillComponent},
{path: 'nuevaexp', component: NewExperienciaComponent},
{path: 'editexp/:id', component: EditExperienciaComponent},
{path: 'nuevaedu', component: NeweducacionComponent},
{path: 'editedu/:id', component: EditeducacionComponent},
{path: 'nuevoproy', component: NewProyectoComponent},
{path: 'editproy/:id', component: EditProyectoComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
