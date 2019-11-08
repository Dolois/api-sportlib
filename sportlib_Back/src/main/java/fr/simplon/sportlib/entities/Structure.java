package fr.simplon.sportlib.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="t_structure")
public class Structure extends AbstractEntity {

    /** structure */
    @Column(nullable = false)
    private String structure;

    /** substructure */
    @Column(nullable = true)
    private String substructure;

    public Structure() {}

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public String getSubstructure() {
        return substructure;
    }

    public void setSubstructure(String substructure) {
        this.substructure = substructure;
    }
}
