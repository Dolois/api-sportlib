import React from 'react'

export default class Footer extends React.Component {

    render() {
        return (
            <footer style={{background: yellowgreen}}>
                <h6>
                    Copyright &copy;2019 Sportlib, tous droits réservés.                    <a href="https://www.doctolib.fr/terms">Termes et conditions</a> &bull; <a href ="https://www.doctolib.fr/terms/legal-notice">Politique</a> de <a href="https://www.doctolib.fr/terms/agreement">confidentialité</a>
                                                                                            <a href="https://www.doctolib.de/terms/legal-notice">Mentions légales</a>
                </h6>
            </footer>
        )
    }
}