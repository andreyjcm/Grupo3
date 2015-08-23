/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author hecferme
 */
public class Item {
        private Integer id;
        private String description;

        public Item(Integer id, String description)
        {
            this.id = id;
            this.description = description;
        }

        public Integer getId()
        {
            return id;
        }

        public String getDescription()
        {
            return description;
        }

        public String toString()
        {
            return description;
        }
}
