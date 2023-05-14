import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

/* Import ng-circle-progress*/
import { NgCircleProgressModule } from 'ng-circle-progress';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './comp/header/header.component';
import { AplogoComponent } from './comp/aplogo/aplogo.component';
import { BannerComponent } from './comp/banner/banner.component';
import { AcercaDeComponent } from './comp/acerca-de/acerca-de.component';
import { ExperienciaComponent } from './comp/experiencia/experiencia.component';
import { EducacionComponent } from './comp/educacion/educacion.component';
import { HardsoftComponent } from './comp/hardsoft/hardsoft.component';
import { ProyectComponent } from './comp/proyect/proyect.component';
import { FooterComponent } from './comp/footer/footer.component';
import { HttpClientModule} from '@angular/common/http';
import { HomeComponent } from './comp/home/home.component';
import { LoginComponent } from './comp/login/login.component';
import { FormsModule } from '@angular/forms';
import { interceptorProvider } from './service/interceptor-service';
import { NewExperienciaComponent } from './comp/experiencia/new-experiencia.component';
import { EditExperienciaComponent } from './comp/experiencia/edit-experiencia.component';
import { EditeducacionComponent } from './comp/educacion/editeducacion.component';
import { NeweducacionComponent } from './comp/educacion/neweducacion.component';
import { EditSkillComponent } from './comp/hardsoft/edit-skill.component';
import { NewSkillComponent } from './comp/hardsoft/new-skill.component';
import { EditAcercaDeComponent } from './comp/acerca-de/edit-acerca-de.component';
import { EditProyectoComponent } from './comp/proyect/edit-proyecto.component';
import { NewProyectoComponent } from './comp/proyect/new-proyecto.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    AplogoComponent,
    BannerComponent,
    AcercaDeComponent,
    ExperienciaComponent,
    EducacionComponent,
    HardsoftComponent,
    ProyectComponent,
    FooterComponent,
    HomeComponent,
    LoginComponent,
    NewExperienciaComponent,
    EditExperienciaComponent,
    EditeducacionComponent,
    NeweducacionComponent,
    EditSkillComponent,
    NewSkillComponent,
    EditAcercaDeComponent,
    EditProyectoComponent,
    NewProyectoComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgCircleProgressModule.forRoot({
      radius: 100,
      outerStrokeWidth: 16,
      innerStrokeWidth: 8,
      outerStrokeColor: "#78C000",
      innerStrokeColor: "#C7E596",
      animationDuration: 300,
    }),
    FormsModule,
    HttpClientModule
  ],
  providers: [
    interceptorProvider
  ],
  bootstrap: [AppComponent]  
})
export class AppModule { }
