import React from 'react'

export default class Header extends React.Component {
 
    render() {
        return (
        <Router>
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <img src="images/SportLib.jpg" alt="Logo Sportlib"/>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
      
                <div class="collapse navbar-collapse" id="navbarSupportedContent" style="background-color: #30c1cf; font-size: 30px;">
                    <ul class="navbar-nav mr-auto" style="list-style: none; padding-left: 10vw;">
                        <li></li>
                        <li class="nav-item pr-5 mr-5">
                            <link to="/home">Accueil</link>
                        </li>
                        <li></li>
                        <li></li>
                        <li class="nav-item pr-3 mr-3">
                            <link to="/place">Lieu</link>
                        </li>
                        <li class="nav-item pr-3 mr-3">
                            <link to="/activity">Activit&egrave;</link>
                        </li>
                        <li>class="nav-item pr-3 mr-3">
                            <link to="/post">Avis</link>
                        </li>
                        <li></li>
                        <li></li>
                        <li class="nav-item" style="padding-left: 15vw;">
                            <link to="/login">Se connecter</link>
                        </li>
                        <li class="nav-item">
                            <link to="/register">S&#039;inscrire</link>
                        </li>
                    </ul>
                </div>
            </nav>

            <switch>
                <Route title="Accueil" path="/home/"> component </Route>
                <Route title="Lieu"    path="/place/"> component </Route>
                <Route title="Activit&egrave;" path="/activity/"> component </Route>
                <Route title="Avis" path="/post/"> component </Route>
                <Route title="Connecter" path="/login/"> component </Route>
                <Route title="Inscrire" path="/register/"> component </Route>
            </switch>
        </Router>
        );
    }
}