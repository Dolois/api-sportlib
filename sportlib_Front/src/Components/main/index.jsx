import React from 'react'

export default class Main extends React.Component {
 
    render() {
        return (
            <section>
                <div>
                    <center><p style="font-size: 27px;"> Prenez rendez-vous en ligne dans un établissement sportif de la ville choisie </p></center>
                </div>
                <div>
                    <center><p class="pb-5" style="font-size: 22px;"> C'est immédiat, simple et gratuit </p></center>
                </div>
            </section>

            <section>
                <div style="margin-top: 10vw; padding-left: 28vw;"></div>
                    <form class="form-inline my-2 my-lg-0">
                        <input class="form-control mr-sm-2" type="search" 
                            placeholder="Structure : piscine" aria-label="Search" style="color: #f2a710; font-size: 25px;">
                        <input class="form-control mr-sm-2" type="search" 
                            placeholder="Ville : 75020 paris" aria-label="Search" style="color: #f2a710; font-size: 25px;">
                    
                        <button class="btn btn-secondary my-2 my-sm-0" type="submit" style="background-color: #30c1cf; color: #FFF; font-size: 25px;">
                            Recherche
                        </button>
                    </form>
                </div>
            </section>
        );
    }
}